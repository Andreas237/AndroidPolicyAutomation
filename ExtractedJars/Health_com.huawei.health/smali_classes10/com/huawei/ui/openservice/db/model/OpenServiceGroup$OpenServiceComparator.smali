.class Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/db/model/OpenServiceGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "OpenServiceComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/Comparator<Lcom/huawei/ui/openservice/db/model/OpenService;>;Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field private isHomePage:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;->isHomePage:Z

    .line 107
    iput-boolean p1, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;->isHomePage:Z

    .line 108
    return-void
.end method


# virtual methods
.method public compare(Lcom/huawei/ui/openservice/db/model/OpenService;Lcom/huawei/ui/openservice/db/model/OpenService;)I
    .locals 2

    .line 112
    iget-boolean v0, p0, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;->isHomePage:Z

    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHomePagePosition()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getHomePagePosition()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    .line 115
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/ui/openservice/db/model/OpenService;->getSubPosition()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/ui/openservice/db/model/OpenService;->getSubPosition()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 102
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/openservice/db/model/OpenService;

    move-object v1, p2

    check-cast v1, Lcom/huawei/ui/openservice/db/model/OpenService;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/ui/openservice/db/model/OpenServiceGroup$OpenServiceComparator;->compare(Lcom/huawei/ui/openservice/db/model/OpenService;Lcom/huawei/ui/openservice/db/model/OpenService;)I

    move-result v0

    return v0
.end method
