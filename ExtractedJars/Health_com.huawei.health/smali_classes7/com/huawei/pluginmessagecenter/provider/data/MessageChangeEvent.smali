.class public Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private modifyMessageObject:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private removeMessageObject:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;Ljava/util/ArrayList<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->modifyMessageObject:Ljava/util/List;

    .line 9
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->removeMessageObject:Ljava/util/List;

    .line 12
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->modifyMessageObject:Ljava/util/List;

    .line 13
    iput-object p2, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->removeMessageObject:Ljava/util/List;

    .line 14
    return-void
.end method


# virtual methods
.method public getModifyMessageObject()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->modifyMessageObject:Ljava/util/List;

    return-object v0
.end method

.method public getRemoveMessageObject()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->removeMessageObject:Ljava/util/List;

    return-object v0
.end method

.method public setModifyMessageObject(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->modifyMessageObject:Ljava/util/List;

    .line 22
    return-void
.end method

.method public setRemoveMessageObject(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 29
    iput-object p1, p0, Lcom/huawei/pluginmessagecenter/provider/data/MessageChangeEvent;->removeMessageObject:Ljava/util/List;

    .line 30
    return-void
.end method
