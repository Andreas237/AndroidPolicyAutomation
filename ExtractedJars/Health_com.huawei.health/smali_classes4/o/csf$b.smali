.class Lo/csf$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/csf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# static fields
.field public static final c:Lo/csf;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Lo/csf;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/csf;-><init>(Lo/csf$5;)V

    sput-object v0, Lo/csf$b;->c:Lo/csf;

    .line 40
    return-void
.end method
