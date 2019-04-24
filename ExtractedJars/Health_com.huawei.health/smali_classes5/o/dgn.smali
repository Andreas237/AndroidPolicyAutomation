.class public Lo/dgn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/String;

.field private c:F

.field private d:I

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lo/dgn;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 30
    iget v0, p0, Lo/dgn;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public b(F)V
    .locals 1

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iput v0, p0, Lo/dgn;->c:F

    .line 43
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 50
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/dgn;->b:Ljava/lang/String;

    .line 51
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 26
    invoke-static {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lo/dgn;->e:Ljava/lang/String;

    .line 27
    return-void
.end method

.method public d()F
    .locals 1

    .line 38
    iget v0, p0, Lo/dgn;->c:F

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 1

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/dgn;->d:I

    .line 35
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/dgn;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/hwcommonmodel/fitnessdatatype/ResultUtils;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
