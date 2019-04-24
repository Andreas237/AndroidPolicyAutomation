.class Lo/cra$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cra;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/cra;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 22
    new-instance v0, Lo/cra;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cra;-><init>(Lo/cra$3;)V

    sput-object v0, Lo/cra$d;->c:Lo/cra;

    .line 23
    return-void
.end method
