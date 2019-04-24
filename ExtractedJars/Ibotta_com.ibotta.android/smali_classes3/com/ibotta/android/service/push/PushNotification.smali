.class public Lcom/ibotta/android/service/push/PushNotification;
.super Ljava/lang/Object;
.source "PushNotification.java"


# instance fields
.field private actionLocKey:Ljava/lang/String;

.field private body:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getActionLocKey()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/service/push/PushNotification;->actionLocKey:Ljava/lang/String;

    return-object v0
.end method

.method public getBody()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/ibotta/android/service/push/PushNotification;->body:Ljava/lang/String;

    return-object v0
.end method

.method public setActionLocKey(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/ibotta/android/service/push/PushNotification;->actionLocKey:Ljava/lang/String;

    return-void
.end method

.method public setBody(Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/ibotta/android/service/push/PushNotification;->body:Ljava/lang/String;

    return-void
.end method
