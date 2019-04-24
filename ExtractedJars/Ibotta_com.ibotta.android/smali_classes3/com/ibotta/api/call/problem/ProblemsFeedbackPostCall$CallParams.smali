.class public Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall$CallParams;
.super Ljava/lang/Object;
.source "ProblemsFeedbackPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private phoneData:Ljava/lang/String;

.field private text:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPhoneData()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall$CallParams;->phoneData:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall$CallParams;->text:Ljava/lang/String;

    return-object v0
.end method

.method public setPhoneData(Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall$CallParams;->phoneData:Ljava/lang/String;

    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/call/problem/ProblemsFeedbackPostCall$CallParams;->text:Ljava/lang/String;

    return-void
.end method
