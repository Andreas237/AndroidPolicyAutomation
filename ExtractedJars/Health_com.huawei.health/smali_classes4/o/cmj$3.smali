.class Lo/cmj$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cmj;->a(Ljava/lang/String;Lo/cmo;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cmj;


# direct methods
.method constructor <init>(Lo/cmj;)V
    .locals 0

    .line 715
    iput-object p1, p0, Lo/cmj$3;->b:Lo/cmj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 718
    iget-object v0, p0, Lo/cmj$3;->b:Lo/cmj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/cmj;->e(Ljava/lang/Object;)V

    .line 719
    return-void
.end method
