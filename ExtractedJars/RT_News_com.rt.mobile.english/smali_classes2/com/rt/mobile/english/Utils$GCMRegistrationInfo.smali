.class public Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;
.super Ljava/lang/Object;
.source "Utils.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/Utils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "GCMRegistrationInfo"
.end annotation


# instance fields
.field private edition:Ljava/lang/String;

.field private subscribed:Z

.field final synthetic this$0:Lcom/rt/mobile/english/Utils;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/rt/mobile/english/Utils;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->this$0:Lcom/rt/mobile/english/Utils;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEdition()Ljava/lang/String;
    .locals 1

    .line 384
    iget-object v0, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->edition:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 388
    iget-object v0, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->token:Ljava/lang/String;

    return-object v0
.end method

.method public isSubscribed()Z
    .locals 1

    .line 392
    iget-boolean v0, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->subscribed:Z

    return v0
.end method

.method public setEdition(Ljava/lang/String;)V
    .locals 0

    .line 400
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->edition:Ljava/lang/String;

    return-void
.end method

.method public setSubscribed(Z)V
    .locals 0

    .line 396
    iput-boolean p1, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->subscribed:Z

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 404
    iput-object p1, p0, Lcom/rt/mobile/english/Utils$GCMRegistrationInfo;->token:Ljava/lang/String;

    return-void
.end method
