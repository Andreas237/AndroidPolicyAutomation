.class Lo/cos$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cos;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# static fields
.field public static final e:Lo/cos;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 96
    new-instance v0, Lo/cos;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/cos;-><init>(Lo/cos$2;)V

    sput-object v0, Lo/cos$e;->e:Lo/cos;

    .line 97
    return-void
.end method
