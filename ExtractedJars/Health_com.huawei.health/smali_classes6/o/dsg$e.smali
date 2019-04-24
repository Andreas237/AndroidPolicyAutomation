.class Lo/dsg$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field c:Lo/dsl;

.field d:Ljava/lang/String;

.field final synthetic e:Lo/dsg;


# direct methods
.method constructor <init>(Lo/dsg;Ljava/lang/String;Lo/dsl;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/dsg$e;->e:Lo/dsg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p3, p0, Lo/dsg$e;->c:Lo/dsl;

    .line 74
    iput-object p2, p0, Lo/dsg$e;->d:Ljava/lang/String;

    .line 75
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 79
    iget-object v0, p0, Lo/dsg$e;->c:Lo/dsl;

    iget-object v1, p0, Lo/dsg$e;->d:Ljava/lang/String;

    invoke-interface {v0, v1}, Lo/dsl;->a(Ljava/lang/String;)V

    .line 80
    return-void
.end method
