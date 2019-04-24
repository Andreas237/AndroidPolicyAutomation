.class Lorg/aviran/cookiebar2/Cookie$4;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie;->dismiss(Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/aviran/cookiebar2/Cookie;

.field final synthetic val$listener:Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;


# direct methods
.method constructor <init>(Lorg/aviran/cookiebar2/Cookie;Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$4;->this$0:Lorg/aviran/cookiebar2/Cookie;

    iput-object p2, p0, Lorg/aviran/cookiebar2/Cookie$4;->val$listener:Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 0

    .line 261
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$4;->val$listener:Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;

    if-eqz p1, :cond_0

    .line 262
    invoke-interface {p1}, Lorg/aviran/cookiebar2/Cookie$CookieBarDismissListener;->onDismiss()V

    .line 264
    :cond_0
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$4;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-static {p1}, Lorg/aviran/cookiebar2/Cookie;->access$100(Lorg/aviran/cookiebar2/Cookie;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
