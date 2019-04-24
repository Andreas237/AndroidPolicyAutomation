.class Lo/eya$8$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eya$8;->a(Lo/eih;Lo/eic;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eya$8;


# direct methods
.method constructor <init>(Lo/eya$8;)V
    .locals 0

    .line 288
    iput-object p1, p0, Lo/eya$8$5;->a:Lo/eya$8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;)F
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;)F"
        }
    .end annotation

    .line 292
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 293
    :cond_0
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    return v0

    .line 295
    :cond_1
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 296
    instance-of v0, v2, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;

    if-nez v0, :cond_2

    .line 297
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "calculateMin not instanceof HwHealthLineEntry! logic error!!!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :cond_2
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 300
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 301
    move-object v6, v5

    check-cast v6, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;

    .line 302
    invoke-virtual {v6}, Lcom/huawei/ui/commonui/linechart/model/HwHealthLineEntry;->acquireModel()Lo/ejp;

    move-result-object v0

    check-cast v0, Lo/eju;

    move-object v7, v0

    check-cast v7, Lo/eju;

    .line 303
    const-string v0, "HR_WARNING_DETAIL"

    invoke-virtual {v7, v0}, Lo/eju;->d(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    .line 304
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 305
    move-object v11, v10

    check-cast v11, Lo/ewf$e;

    .line 306
    iget v0, v11, Lo/ewf$e;->e:I

    int-to-float v0, v0

    cmpg-float v0, v0, v3

    if-gez v0, :cond_3

    .line 307
    iget v0, v11, Lo/ewf$e;->e:I

    int-to-float v3, v0

    .line 309
    :cond_3
    goto :goto_1

    .line 310
    :cond_4
    goto :goto_0

    .line 311
    :cond_5
    return v3
.end method
