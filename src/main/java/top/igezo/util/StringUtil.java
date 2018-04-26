package top.igezo.util;

import org.apache.commons.lang3.StringUtils;
/**
 * Created by igezo on 2018/4/26.
 */
public final class StringUtil {

    public static boolean isEmpty(String str){
        if (str!=null){
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
