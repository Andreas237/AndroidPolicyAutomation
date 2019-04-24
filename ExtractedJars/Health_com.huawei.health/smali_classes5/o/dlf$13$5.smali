.class Lo/dlf$13$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$13;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dlf$13;


# direct methods
.method constructor <init>(Lo/dlf$13;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lo/dlf$13$5;->d:Lo/dlf$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 381
    iget-object v0, p0, Lo/dlf$13$5;->d:Lo/dlf$13;

    iget-object v0, v0, Lo/dlf$13;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->p(Lo/dlf;)V

    .line 382
    return-void
.end method
