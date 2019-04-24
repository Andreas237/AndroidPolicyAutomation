.class public Lcom/ibotta/api/model/invite/WaitingList;
.super Ljava/lang/Object;
.source "WaitingList.java"


# instance fields
.field private inviteCode:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getInviteCode()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/ibotta/api/model/invite/WaitingList;->inviteCode:Ljava/lang/String;

    return-object v0
.end method

.method public setInviteCode(Ljava/lang/String;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/ibotta/api/model/invite/WaitingList;->inviteCode:Ljava/lang/String;

    return-void
.end method
