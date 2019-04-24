.class public Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private date:I

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    return-void
.end method


# virtual methods
.method public getDate()I
    .locals 1

    .line 27
    iget v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->date:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setDate(I)V
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->date:I

    .line 32
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceVersion;->version:Ljava/lang/String;

    .line 24
    return-void
.end method
