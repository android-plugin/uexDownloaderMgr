package org.zywx.wbpalmstar.plugin.uexdownloadermgr.vo;

import java.io.Serializable;

/**
 * Created by ylt on 16/7/28.
 */

public class CreateVO implements Serializable{

    private static final long serialVersionUID = -2336547146731431732L;

    public final static String AUTO_URL_ENCODE_ENABLE = "0";
    public final static String AUTO_URL_ENCODE_DISABLE = "1";

    public int Id=-1;

    public String disableAutoUrlEncode = AUTO_URL_ENCODE_ENABLE;

}
