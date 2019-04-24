.class Lo/brt$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->setAdapter(Lo/eab;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;)V
    .locals 0

    .line 298
    iput-object p1, p0, Lo/brt$3;->e:Lo/brt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 301
    iget-object v0, p0, Lo/brt$3;->e:Lo/brt;

    invoke-static {v0}, Lo/brt;->e(Lo/brt;)V

    .line 302
    return-void
.end method
