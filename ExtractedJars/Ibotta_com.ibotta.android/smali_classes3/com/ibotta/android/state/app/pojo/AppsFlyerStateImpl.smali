.class public Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;
.super Ljava/lang/Object;
.source "AppsFlyerStateImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/app/pojo/AppsFlyerState;


# instance fields
.field private deepLink:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public clearDeepLink()V
    .locals 1

    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;->deepLink:Ljava/lang/String;

    return-void
.end method

.method public getDeepLink()Ljava/lang/String;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;->deepLink:Ljava/lang/String;

    return-object v0
.end method

.method public setDeepLink(Ljava/lang/String;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/state/app/pojo/AppsFlyerStateImpl;->deepLink:Ljava/lang/String;

    return-void
.end method
