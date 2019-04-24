.class public interface abstract Lcom/huawei/hwCloudJs/api/IJsActionbar;
.super Ljava/lang/Object;


# annotations
.annotation build Lcom/huawei/hwCloudJs/support/enables/NoProguard;
.end annotation


# virtual methods
.method public abstract getActionbarTitle()Ljava/lang/String;
.end method

.method public abstract getStartClickListenner()Lcom/huawei/hwCloudJs/api/ActionbarClickListenner;
.end method

.method public abstract getStartIcon()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract handleOptionsItemSelected(Landroid/view/MenuItem;)V
.end method

.method public abstract isShow()Z
.end method

.method public abstract setContext(Landroid/content/Context;)V
.end method

.method public abstract setControlIcon(Landroid/content/Context;Landroid/webkit/WebView;Ljava/lang/String;Landroid/view/View;Landroid/view/Menu;)V
.end method

.method public abstract textcolorID()Ljava/lang/String;
.end method
