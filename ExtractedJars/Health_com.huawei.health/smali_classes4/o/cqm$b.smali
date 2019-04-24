.class Lo/cqm$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final a:Lo/cqm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Lo/cqm;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqm;-><init>(Lo/cqm$5;)V

    sput-object v0, Lo/cqm$b;->a:Lo/cqm;

    .line 36
    return-void
.end method
