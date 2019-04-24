.class public Lcom/huawei/datatype/Contact;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private icon_index:Ljava/lang/String;

.field private index:I

.field private name:Ljava/lang/String;

.field private note:Ljava/lang/String;

.field private phoneNumbers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/datatype/PhoneNumber;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/datatype/Contact;->index:I

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/datatype/Contact;->note:Ljava/lang/String;

    .line 17
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Lcom/huawei/datatype/PhoneNumber;>;)V"
        }
    .end annotation

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/datatype/Contact;->index:I

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/datatype/Contact;->note:Ljava/lang/String;

    .line 17
    const-string v0, "-1"

    iput-object v0, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    .line 70
    iput-object p2, p0, Lcom/huawei/datatype/Contact;->name:Ljava/lang/String;

    .line 71
    iput-object p3, p0, Lcom/huawei/datatype/Contact;->phoneNumbers:Ljava/util/List;

    .line 72
    iput-object p1, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    .line 73
    return-void
.end method


# virtual methods
.method public getIcon_index()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    return-object v0
.end method

.method public getIndex()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/huawei/datatype/Contact;->index:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/datatype/Contact;->name:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getNote()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/datatype/Contact;->note:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPhoneNumbers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/datatype/PhoneNumber;>;"
        }
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/huawei/datatype/Contact;->phoneNumbers:Ljava/util/List;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public procContact1()V
    .locals 0

    .line 77
    return-void
.end method

.method public procContact2()V
    .locals 0

    .line 80
    return-void
.end method

.method public procContact3()V
    .locals 0

    .line 83
    return-void
.end method

.method public procContact4()V
    .locals 0

    .line 86
    return-void
.end method

.method public procContact5()V
    .locals 0

    .line 89
    return-void
.end method

.method public procContact6()V
    .locals 0

    .line 92
    return-void
.end method

.method public procContact7()V
    .locals 0

    .line 95
    return-void
.end method

.method public setIcon_index(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setIndex(I)V
    .locals 0

    .line 24
    iput p1, p0, Lcom/huawei/datatype/Contact;->index:I

    .line 25
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/datatype/Contact;->name:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setPhoneNumbers(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/datatype/PhoneNumber;>;)V"
        }
    .end annotation

    .line 40
    iput-object p1, p0, Lcom/huawei/datatype/Contact;->phoneNumbers:Ljava/util/List;

    .line 41
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[Contact: name = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/Contact;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", note = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/Contact;->note:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", icon_index = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/Contact;->icon_index:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneNumbers = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/datatype/Contact;->phoneNumbers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
