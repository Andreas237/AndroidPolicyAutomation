.class public Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# instance fields
.field private elementName:Ljava/lang/String;

.field private groupId:Ljava/lang/String;

.field private namespace:Ljava/lang/String;

.field private op:Ljava/lang/String;

.field private operatorId:Ljava/lang/String;

.field private operatorName:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private userList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;"
        }
    .end annotation
.end field

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->userList:Ljava/util/List;

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->elementName:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->namespace:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method public addMemInfo(Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;)V
    .locals 1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->userList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    return-void
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 131
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->elementName:Ljava/lang/String;

    .line 132
    return-object v0
.end method

.method public getGroupId()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->groupId:Ljava/lang/String;

    .line 55
    return-object v0
.end method

.method public getMemInfoList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/sns/server/im/message/impl/packet/MemInfo;>;"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->userList:Ljava/util/List;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->namespace:Ljava/lang/String;

    .line 139
    return-object v0
.end method

.method public getOp()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->op:Ljava/lang/String;

    .line 88
    return-object v0
.end method

.method public getOperatorId()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->operatorId:Ljava/lang/String;

    .line 99
    return-object v0
.end method

.method public getOperatorName()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->operatorName:Ljava/lang/String;

    .line 110
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->type:Ljava/lang/String;

    .line 77
    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->version:Ljava/lang/String;

    .line 66
    return-object v0
.end method

.method public setGroupId(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->groupId:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setOp(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->op:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setOperatorId(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->operatorId:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public setOperatorName(Ljava/lang/String;)V
    .locals 0

    .line 115
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->operatorName:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->type:Ljava/lang/String;

    .line 83
    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->version:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 18
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupMemChangeExtension;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 1

    .line 145
    const/4 v0, 0x0

    return-object v0
.end method
