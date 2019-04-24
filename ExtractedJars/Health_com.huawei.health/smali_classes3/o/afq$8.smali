.class final Lo/afq$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/afq;->b(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/aff;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V
    .locals 0

    .line 588
    iput-object p1, p0, Lo/afq$8;->e:Ljava/lang/String;

    iput-object p2, p0, Lo/afq$8;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/afq$8;->a:Lo/aff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 591
    invoke-static {}, Lo/afn;->e()Lo/afn;

    move-result-object v0

    iget-object v1, p0, Lo/afq$8;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/afq$8;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/afq$8;->a:Lo/aff;

    invoke-virtual {v0, v1, v2, v3}, Lo/afn;->e(Ljava/lang/String;Ljava/lang/String;Lo/aff;)V

    .line 592
    return-void
.end method
