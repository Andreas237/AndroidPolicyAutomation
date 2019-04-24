.class Lo/afq$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->b(Ljava/lang/String;Lo/aff;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/afq;

.field final synthetic c:Lo/aff;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/afq;Ljava/lang/String;Lo/aff;)V
    .locals 0

    .line 528
    iput-object p1, p0, Lo/afq$9;->b:Lo/afq;

    iput-object p2, p0, Lo/afq$9;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/afq$9;->c:Lo/aff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 531
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$9;->d:Ljava/lang/String;

    sget-object v2, Lo/agx;->a:Ljava/lang/String;

    new-instance v3, Lo/afq$9$1;

    invoke-direct {v3, p0}, Lo/afq$9$1;-><init>(Lo/afq$9;)V

    invoke-virtual {v0, v1, v2, v3}, Lo/afn;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 575
    return-void
.end method
