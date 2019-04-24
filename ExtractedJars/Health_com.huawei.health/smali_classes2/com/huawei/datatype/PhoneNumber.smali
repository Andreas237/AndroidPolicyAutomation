.class public Lcom/huawei/datatype/PhoneNumber;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private phone_number:Ljava/lang/String;

.field private phone_tag:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, "Mobile"

    iput-object v0, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    const-string v0, "Mobile"

    iput-object v0, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    .line 35
    iput-object p1, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lcom/huawei/datatype/PhoneNumber;->phone_number:Ljava/lang/String;

    .line 37
    return-void
.end method


# virtual methods
.method public getPhone_number()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/huawei/datatype/PhoneNumber;->phone_number:Ljava/lang/String;

    return-object v0
.end method

.method public getPhone_tag()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    return-object v0
.end method

.method public setPhone_number(Ljava/lang/String;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/datatype/PhoneNumber;->phone_number:Ljava/lang/String;

    .line 16
    return-void
.end method

.method public setPhone_tag(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[PhoneNumber: phone_tag = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PhoneNumber;->phone_tag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phone_number = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/PhoneNumber;->phone_number:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
