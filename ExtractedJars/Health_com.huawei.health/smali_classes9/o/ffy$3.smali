.class Lo/ffy$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffy;->e(Lo/ffu;Lo/ffv;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/ffy;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lo/ffu;

.field final synthetic e:Lo/ffv;


# direct methods
.method constructor <init>(Lo/ffy;Ljava/lang/String;Ljava/lang/String;Lo/ffu;Lo/ffv;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lo/ffy$3;->b:Lo/ffy;

    iput-object p2, p0, Lo/ffy$3;->c:Ljava/lang/String;

    iput-object p3, p0, Lo/ffy$3;->a:Ljava/lang/String;

    iput-object p4, p0, Lo/ffy$3;->d:Lo/ffu;

    iput-object p5, p0, Lo/ffy$3;->e:Lo/ffv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 264
    iget-object v0, p0, Lo/ffy$3;->b:Lo/ffy;

    iget-object v1, p0, Lo/ffy$3;->c:Ljava/lang/String;

    iget-object v2, p0, Lo/ffy$3;->a:Ljava/lang/String;

    iget-object v3, p0, Lo/ffy$3;->d:Lo/ffu;

    iget-object v4, p0, Lo/ffy$3;->e:Lo/ffv;

    invoke-static {v0, v1, v2, v3, v4}, Lo/ffy;->b(Lo/ffy;Ljava/lang/String;Ljava/lang/String;Lo/ffu;Lo/ffv;)V

    .line 265
    return-void
.end method
