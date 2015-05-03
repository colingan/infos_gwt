
/**
 * Tencent.com Inc.
 * Copyright (c) 1998-2015 All Rights Reserved.
 */

package com.github.colingan.client.common.presenter;

import com.github.colingan.client.common.InfosPresenter;
import com.soso.tg.cmvp.client.display.Display;


 /**
 * @title HeaderPresenter
 * @description TODO 
 * @author colingan
 * @date 2015-5-3
 * @version 1.0
 */

public class HeaderPresenter extends InfosPresenter {

  public interface View extends Display {

  }

  protected final View view;

  public HeaderPresenter() {
    view = null;
  }

  /* (non-Javadoc)
   * @see com.soso.tg.cmvp.client.presenter.Presenter#getDisplay()
   */

  @Override
  public Display getDisplay() {

    // TODO Auto-generated method stub
    return null;

  }

}

