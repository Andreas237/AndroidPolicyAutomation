.class Lo/auu$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/auu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final c:Lo/auu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 57
    new-instance v0, Lo/auu;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/auu;-><init>(Lo/auu$3;)V

    sput-object v0, Lo/auu$e;->c:Lo/auu;

    return-void
.end method
