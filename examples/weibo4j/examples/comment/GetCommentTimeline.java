package weibo4j.examples.comment;

import java.util.List;

import weibo4j.Comments;
import weibo4j.Weibo;
import weibo4j.examples.Log;
import weibo4j.model.Comment;
import weibo4j.model.WeiboException;

public class GetCommentTimeline {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String access_token = "bc2a9b7eae843e903f05862136d50102";
		Weibo weibo = new Weibo();
		weibo.setToken(access_token);
		Comments cm = new Comments();
		try {
			List<Comment> comment = cm.getCommentTimeline();
			for(Comment c : comment){
				Log.logInfo(c.toString());
			}
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}

}
