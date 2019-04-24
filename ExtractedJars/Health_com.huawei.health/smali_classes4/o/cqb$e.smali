.class Lo/cqb$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cqb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final b:Lo/cqb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 35
    new-instance v0, Lo/cqb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cqb;-><init>(Lo/cqb$5;)V

    sput-object v0, Lo/cqb$e;->b:Lo/cqb;

    .line 36
    return-void
.end method
