.class Lo/dlf$12$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$12;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dlf$12;


# direct methods
.method constructor <init>(Lo/dlf$12;)V
    .locals 0

    .line 349
    iput-object p1, p0, Lo/dlf$12$2;->e:Lo/dlf$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 352
    iget-object v0, p0, Lo/dlf$12$2;->e:Lo/dlf$12;

    iget-object v0, v0, Lo/dlf$12;->a:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->f(Lo/dlf;)V

    .line 353
    return-void
.end method
