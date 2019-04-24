.class Lo/dlf$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlf;


# direct methods
.method constructor <init>(Lo/dlf;)V
    .locals 0

    .line 515
    iput-object p1, p0, Lo/dlf$2;->b:Lo/dlf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 1

    .line 523
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-ne p1, v0, :cond_1

    .line 524
    :cond_0
    iget-object v0, p0, Lo/dlf$2;->b:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->g(Lo/dlf;)Lo/dlt;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlt;->a()V

    .line 526
    :cond_1
    return-void
.end method

.method public onResult(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 519
    return-void
.end method
