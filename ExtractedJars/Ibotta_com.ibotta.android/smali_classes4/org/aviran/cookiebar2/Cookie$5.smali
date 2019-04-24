.class Lorg/aviran/cookiebar2/Cookie$5;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie;->removeFromParent()V
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

    .line 278
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$5;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 281
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie$5;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v0}, Lorg/aviran/cookiebar2/Cookie;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 283
    iget-object v1, p0, Lorg/aviran/cookiebar2/Cookie$5;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v1}, Lorg/aviran/cookiebar2/Cookie;->clearAnimation()V

    .line 284
    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lorg/aviran/cookiebar2/Cookie$5;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    return-void
.end method
