.class Lorg/aviran/cookiebar2/Cookie$6;
.super Ljava/lang/Object;
.source "Cookie.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/aviran/cookiebar2/Cookie;->getDestroyListener()Landroid/animation/Animator$AnimatorListener;
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

    .line 337
    iput-object p1, p0, Lorg/aviran/cookiebar2/Cookie$6;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 345
    iget-object p1, p0, Lorg/aviran/cookiebar2/Cookie$6;->this$0:Lorg/aviran/cookiebar2/Cookie;

    invoke-static {p1}, Lorg/aviran/cookiebar2/Cookie;->access$100(Lorg/aviran/cookiebar2/Cookie;)V

    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
