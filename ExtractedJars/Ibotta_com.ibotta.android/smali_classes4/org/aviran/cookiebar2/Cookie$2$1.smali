.class Lorg/aviran/cookiebar2/Cookie$2$1;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie$2;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lorg/aviran/cookiebar2/Cookie$2;


# direct methods
.method constructor <init>(Lorg/aviran/cookiebar2/Cookie$2;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$2$1;->this$1:Lorg/aviran/cookiebar2/Cookie$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 208
    iget-object v0, p0, Lorg/aviran/cookiebar2/Cookie$2$1;->this$1:Lorg/aviran/cookiebar2/Cookie$2;

    iget-object v0, v0, Lorg/aviran/cookiebar2/Cookie$2;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-virtual {v0}, Lorg/aviran/cookiebar2/Cookie;->dismiss()V

    return-void
.end method
