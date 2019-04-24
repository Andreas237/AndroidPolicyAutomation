.class public Lo/dvf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected dataType:I

.field protected huid:Ljava/lang/String;

.field protected key:I

.field protected type:Ljava/lang/String;

.field protected values:Ljava/lang/String;

.field protected year:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const/4 v0, -0x1

    iput v0, p0, Lo/dvf;->dataType:I

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/dvf;->huid:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput v0, p0, Lo/dvf;->key:I

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lo/dvf;->values:Ljava/lang/String;

    .line 24
    const-string v0, ""

    iput-object v0, p0, Lo/dvf;->type:Ljava/lang/String;

    .line 29
    const/4 v0, 0x0

    iput v0, p0, Lo/dvf;->year:I

    .line 35
    iput p1, p0, Lo/dvf;->dataType:I

    .line 36
    return-void
.end method


# virtual methods
.method public acquireDataType()I
    .locals 1

    .line 47
    iget v0, p0, Lo/dvf;->dataType:I

    return v0
.end method

.method public getHuid()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dvf;->huid:Ljava/lang/String;

    return-object v0
.end method

.method public getKey()I
    .locals 1

    .line 59
    iget v0, p0, Lo/dvf;->key:I

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/dvf;->type:Ljava/lang/String;

    return-object v0
.end method

.method public getValues()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/dvf;->values:Ljava/lang/String;

    return-object v0
.end method

.method public getYear()I
    .locals 1

    .line 67
    iget v0, p0, Lo/dvf;->year:I

    return v0
.end method

.method public setHuid(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/dvf;->huid:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setKey(I)V
    .locals 0

    .line 63
    iput p1, p0, Lo/dvf;->key:I

    .line 64
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lo/dvf;->type:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setValues(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/dvf;->values:Ljava/lang/String;

    .line 56
    return-void
.end method

.method public setYear(I)V
    .locals 0

    .line 71
    iput p1, p0, Lo/dvf;->year:I

    .line 72
    return-void
.end method
