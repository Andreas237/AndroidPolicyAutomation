.class public Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseControlVariant;
.super Ljava/lang/Object;
.source "PwiPlayhouseControlVariant.java"

# interfaces
.implements Lcom/ibotta/android/features/ControlVariant;
.implements Lcom/ibotta/android/features/variant/pwi/PwiPlayhouseVariant;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPwiFlowClass()Ljava/lang/Class;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 12
    const-class v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PwiHomeActivity;

    return-object v0
.end method
