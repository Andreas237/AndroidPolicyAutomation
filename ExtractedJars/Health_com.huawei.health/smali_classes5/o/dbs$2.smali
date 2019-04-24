.class Lo/dbs$2;
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/dbs;


# direct methods
.method constructor <init>(Lo/dbs;Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/dbs$2;->b:Lo/dbs;

    iput-object p2, p0, Lo/dbs$2;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 112
    iget-object v0, p0, Lo/dbs$2;->b:Lo/dbs;

    iget-object v1, p0, Lo/dbs$2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/dbs;->onDenied(Ljava/lang/String;)V

    .line 113
    return-void
.end method
