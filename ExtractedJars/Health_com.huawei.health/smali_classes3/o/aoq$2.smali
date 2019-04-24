.class Lo/aoq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcx;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aoq;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/aoq;


# direct methods
.method constructor <init>(Lo/aoq;)V
    .locals 0

    .line 368
    iput-object p1, p0, Lo/aoq$2;->e:Lo/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProcessed(Lo/ddb;)V
    .locals 2

    .line 371
    const-string v0, "HwAccountManager"

    const-string v1, "getCountryCode"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    return-void
.end method
