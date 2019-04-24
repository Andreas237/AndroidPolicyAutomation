.class public final Lo/bbz$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/provider/BaseColumns;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bbz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# static fields
.field public static final b:Landroid/net/Uri;

.field public static final e:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1080
    const-string v0, "content://com.huawei.health.sns.provider/t_user_circle"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lo/bbz$k;->b:Landroid/net/Uri;

    .line 1091
    const-string v0, "content://com.huawei.health.sns.provider/user_circle_detail"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lo/bbz$k;->e:Landroid/net/Uri;

    return-void
.end method
