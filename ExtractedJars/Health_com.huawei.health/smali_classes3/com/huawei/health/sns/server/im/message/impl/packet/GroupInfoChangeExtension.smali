.class public Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/jivesoftware/smack/packet/ExtensionElement;


# instance fields
.field private downloadUrl:Ljava/lang/String;

.field private elementName:Ljava/lang/String;

.field private groupId:Ljava/lang/String;

.field private groupImageUrl:Ljava/lang/String;

.field private groupName:Ljava/lang/String;

.field private managerId:Ljava/lang/String;

.field private managerName:Ljava/lang/String;

.field private namespace:Ljava/lang/String;

.field private op:Ljava/lang/String;

.field private operatorId:Ljava/lang/String;

.field private operatorName:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->elementName:Ljava/lang/String;

    .line 75
    iput-object p2, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->namespace:Ljava/lang/String;

    .line 76
    return-void
.end method


# virtual methods
.method public getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->downloadUrl:Ljava/lang/String;

    .line 165
    return-object v0
.end method

.method public getElementName()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->elementName:Ljava/lang/String;

    .line 137
    return-object v0
.end method

.method public getGroupId()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupId:Ljava/lang/String;

    .line 81
    return-object v0
.end method

.method public getGroupImageUrl()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupImageUrl:Ljava/lang/String;

    .line 154
    return-object v0
.end method

.method public getGroupName()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupName:Ljava/lang/String;

    .line 143
    return-object v0
.end method

.method public getManagerId()Ljava/lang/String;
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->managerId:Ljava/lang/String;

    return-object v0
.end method

.method public getManagerName()Ljava/lang/String;
    .locals 1

    .line 185
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->managerName:Ljava/lang/String;

    return-object v0
.end method

.method public getNamespace()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->namespace:Ljava/lang/String;

    .line 197
    return-object v0
.end method

.method public getOp()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->op:Ljava/lang/String;

    .line 103
    return-object v0
.end method

.method public getOperatorId()Ljava/lang/String;
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->operatorId:Ljava/lang/String;

    .line 114
    return-object v0
.end method

.method public getOperatorName()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->operatorName:Ljava/lang/String;

    .line 125
    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->type:Ljava/lang/String;

    .line 92
    return-object v0
.end method

.method public setDownloadUrl(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->downloadUrl:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setGroupId(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupId:Ljava/lang/String;

    .line 87
    return-void
.end method

.method public setGroupImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupImageUrl:Ljava/lang/String;

    .line 160
    return-void
.end method

.method public setGroupName(Ljava/lang/String;)V
    .locals 0

    .line 148
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->groupName:Ljava/lang/String;

    .line 149
    return-void
.end method

.method public setManagerId(Ljava/lang/String;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->managerId:Ljava/lang/String;

    .line 181
    return-void
.end method

.method public setManagerName(Ljava/lang/String;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->managerName:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public setOp(Ljava/lang/String;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->op:Ljava/lang/String;

    .line 109
    return-void
.end method

.method public setOperatorId(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->operatorId:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public setOperatorName(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->operatorName:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 97
    iput-object p1, p0, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->type:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public bridge synthetic toXML()Ljava/lang/CharSequence;
    .locals 1

    .line 15
    invoke-virtual {p0}, Lcom/huawei/health/sns/server/im/message/impl/packet/GroupInfoChangeExtension;->toXML()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toXML()Ljava/lang/String;
    .locals 1

    .line 203
    const/4 v0, 0x0

    return-object v0
.end method
