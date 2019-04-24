.class Lo/cec$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cec;->e(Ljava/lang/Object;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cec;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lo/cec;Ljava/lang/Object;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lo/cec$3;->a:Lo/cec;

    iput-object p2, p0, Lo/cec$3;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 228
    iget-object v0, p0, Lo/cec$3;->a:Lo/cec;

    iget-object v1, p0, Lo/cec$3;->d:Ljava/lang/Object;

    invoke-static {v0, v1}, Lo/cec;->d(Lo/cec;Ljava/lang/Object;)V

    .line 229
    return-void
.end method
