.class public Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;
.super Ljava/lang/Object;
.source "ProblemsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/problem/ProblemsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private itemId:J

.field private itemType:Ljava/lang/String;

.field private phoneData:Ljava/lang/String;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemId()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->itemId:J

    return-wide v0
.end method

.method public getItemType()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->itemType:Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneData()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->phoneData:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setItemId(J)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->itemId:J

    return-void
.end method

.method public setItemType(Ljava/lang/String;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->itemType:Ljava/lang/String;

    return-void
.end method

.method public setPhoneData(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->phoneData:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsPostCall$CallParams;->text:Ljava/lang/String;

    return-void
.end method
