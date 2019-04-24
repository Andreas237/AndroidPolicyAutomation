.class Lo/dbs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dbs;->onResult(Ljava/lang/String;Lo/dbl;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dbs;


# direct methods
.method constructor <init>(Lo/dbs;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lo/dbs$3;->e:Lo/dbs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 103
    iget-object v0, p0, Lo/dbs$3;->e:Lo/dbs;

    invoke-virtual {v0}, Lo/dbs;->onGranted()V

    .line 104
    return-void
.end method
