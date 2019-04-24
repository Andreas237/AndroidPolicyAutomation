.class public Lo/fif$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fif;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 67
    move-object v2, p1

    check-cast v2, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 68
    move-object v3, p2

    check-cast v3, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 69
    invoke-virtual {v3}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v0

    invoke-virtual {v2}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getWeight()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method
