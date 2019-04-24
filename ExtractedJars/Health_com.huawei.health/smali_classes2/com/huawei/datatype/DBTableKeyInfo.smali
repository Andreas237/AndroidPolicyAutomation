.class public Lcom/huawei/datatype/DBTableKeyInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private keyName:Ljava/lang/String;

.field private keyType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getKeyName()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/datatype/DBTableKeyInfo;->keyName:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyType()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/datatype/DBTableKeyInfo;->keyType:Ljava/lang/String;

    return-object v0
.end method

.method public setKeyName(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/datatype/DBTableKeyInfo;->keyName:Ljava/lang/String;

    .line 17
    return-void
.end method

.method public setKeyType(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/datatype/DBTableKeyInfo;->keyType:Ljava/lang/String;

    .line 25
    return-void
.end method
