.class public Lcom/huawei/openalliance/ad/n/g;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/n/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/n/g;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;)Lcom/huawei/openalliance/ad/n/a/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lcom/huawei/openalliance/ad/n/a/a;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    :cond_0
    new-instance v1, Lcom/huawei/openalliance/ad/n/e;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/n/e;-><init>()V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/db/bean/ContentRecord;->getClickActionList()Ljava/util/List;

    move-result-object v2

    invoke-static {p0, p1, p2, v2}, Lcom/huawei/openalliance/ad/n/g;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v4, 0x0

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/n/a/a;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v6}, Lcom/huawei/openalliance/ad/n/a/a;->a(Lcom/huawei/openalliance/ad/n/a/a;)V

    :cond_2
    move-object v4, v6

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/openalliance/ad/n/a/a;

    goto :goto_1

    :cond_4
    new-instance v1, Lcom/huawei/openalliance/ad/n/e;

    invoke-direct {v1}, Lcom/huawei/openalliance/ad/n/e;-><init>()V

    :goto_1
    return-object v1
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/List<Ljava/lang/Integer;>;)Ljava/util/List<Lcom/huawei/openalliance/ad/n/a/a;>;"
        }
    .end annotation

    const/4 v3, 0x0

    if-eqz p3, :cond_1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    new-instance v4, Lcom/huawei/openalliance/ad/n/d;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lcom/huawei/openalliance/ad/n/d;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Z)V

    goto :goto_2

    :pswitch_1
    new-instance v4, Lcom/huawei/openalliance/ad/n/c;

    invoke-direct {v4, p0, p1, p2}, Lcom/huawei/openalliance/ad/n/c;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Ljava/util/Map;)V

    goto :goto_2

    :pswitch_2
    new-instance v4, Lcom/huawei/openalliance/ad/n/a;

    invoke-direct {v4, p0, p1}, Lcom/huawei/openalliance/ad/n/a;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_2

    :pswitch_3
    new-instance v4, Lcom/huawei/openalliance/ad/n/d;

    const/4 v0, 0x1

    invoke-direct {v4, p0, p1, v0}, Lcom/huawei/openalliance/ad/n/d;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;Z)V

    goto :goto_2

    :pswitch_4
    new-instance v4, Lcom/huawei/openalliance/ad/n/f;

    invoke-direct {v4, p0, p1}, Lcom/huawei/openalliance/ad/n/f;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_2

    :pswitch_5
    new-instance v4, Lcom/huawei/openalliance/ad/n/b;

    invoke-direct {v4, p0, p1}, Lcom/huawei/openalliance/ad/n/b;-><init>(Landroid/content/Context;Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V

    goto :goto_2

    :pswitch_6
    new-instance v4, Lcom/huawei/openalliance/ad/n/e;

    invoke-direct {v4}, Lcom/huawei/openalliance/ad/n/e;-><init>()V

    goto :goto_2

    :goto_1
    const/4 v4, 0x0

    sget-object v0, Lcom/huawei/openalliance/ad/n/g;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unsupport action:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    if-eqz v4, :cond_0

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    goto/16 :goto_0

    :cond_1
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
