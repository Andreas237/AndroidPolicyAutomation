.class final Lorg/aviran/cookiebar2/CookieBar$Params;
.super Ljava/lang/Object;
.source "CookieBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/aviran/cookiebar2/CookieBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Params"
.end annotation


# instance fields
.field public action:Ljava/lang/String;

.field public actionColor:I

.field public backgroundColor:I

.field public customView:Landroid/view/View;

.field public duration:J

.field public iconAnimator:Landroid/animation/AnimatorSet;

.field public iconResId:I

.field public layoutGravity:I

.field public message:Ljava/lang/String;

.field public messageColor:I

.field public onActionClickListener:Lorg/aviran/cookiebar2/OnActionClickListener;

.field public title:Ljava/lang/String;

.field public titleColor:I


# direct methods
.method constructor <init>()V
    .locals 2

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x7d0

    .line 219
    iput-wide v0, p0, Lorg/aviran/cookiebar2/CookieBar$Params;->duration:J

    const/16 v0, 0x30

    .line 220
    iput v0, p0, Lorg/aviran/cookiebar2/CookieBar$Params;->layoutGravity:I

    return-void
.end method
