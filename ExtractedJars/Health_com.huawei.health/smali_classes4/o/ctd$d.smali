.class Lo/ctd$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ctd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# static fields
.field public static final c:Lo/ctd;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 34
    new-instance v0, Lo/ctd;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/ctd;-><init>(Lo/ctd$3;)V

    sput-object v0, Lo/ctd$d;->c:Lo/ctd;

    .line 35
    return-void
.end method
