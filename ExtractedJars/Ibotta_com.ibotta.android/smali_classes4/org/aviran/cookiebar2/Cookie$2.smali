.class Lorg/aviran/cookiebar2/Cookie$2;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie;->createInAnim()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/aviran/cookiebar2/Cookie;


# direct methods
.method constructor <init>(Lorg/aviran/cookiebar2/Cookie;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$2;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3

    .line 205
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$2;->this$0:Lorg/aviran/cookiebar2/Cookie;

    new-instance v0, Lorg/aviran/cookiebar2/Cookie$2$1;

    invoke-direct {v0, p0}, Lorg/aviran/cookiebar2/Cookie$2$1;-><init>(Lorg/aviran/cookiebar2/Cookie$2;)V

    iget-object v1, p0, Lorg/aviran/cookiebar2/Cookie$2;->this$0:Lorg/aviran/cookiebar2/Cookie;

    .line 210
    invoke-static {v1}, Lorg/aviran/cookiebar2/Cookie;->access$000(Lorg/aviran/cookiebar2/Cookie;)J

    move-result-wide v1

    .line 205
    invoke-virtual {p1, v0, v1, v2}, Lorg/aviran/cookiebar2/Cookie;->postDelayed(Ljava/lang/Runnable;J)Z

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
