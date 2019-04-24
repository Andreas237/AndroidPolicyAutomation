.class public final Lo/awp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private d:Landroid/content/ContentResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 26
    const-class v0, Lo/awp;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/awp;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lo/awp;->d:Landroid/content/ContentResolver;

    .line 41
    return-void
.end method

.method private a(Ljava/lang/String;)Landroid/database/Cursor;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/database/SQLException;,
            Ljava/lang/IllegalStateException;
        }
    .end annotation

    .line 102
    const-string v6, "setting_key = ?"

    .line 103
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    .line 104
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 105
    iget-object v0, p0, Lo/awp;->d:Landroid/content/ContentResolver;

    sget-object v1, Lo/bbz$f;->e:Landroid/net/Uri;

    move-object v3, v6

    move-object v4, v7

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 53
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 58
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    .line 59
    const-string v0, "setting_key"

    invoke-virtual {v5, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string v0, "setting_value"

    invoke-virtual {v5, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string v0, "ContentValuesKey"

    invoke-virtual {v4, v0, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 62
    const-wide/16 v6, -0x1

    .line 65
    :try_start_0
    iget-object v0, p0, Lo/awp;->d:Landroid/content/ContentResolver;

    const-string v1, "content://com.huawei.health.sns.provider"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "t_setting"

    const-string v3, "ContentValuesKey"

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v8

    .line 66
    if-eqz v8, :cond_1

    .line 69
    const-string v0, "rowID"

    const-wide/16 v1, -0x1

    invoke-virtual {v8, v0, v1, v2}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    move-wide v6, v0

    goto :goto_0

    .line 73
    :cond_1
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    const-string v1, "updateSetting result bundle is null."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    .line 83
    :goto_0
    goto :goto_1

    .line 76
    :catch_0
    move-exception v8

    .line 78
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    const-string v1, "updateSetting SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    goto :goto_1

    .line 80
    :catch_1
    move-exception v8

    .line 82
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    const-string v1, "updateSetting IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_2

    const/4 v8, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    .line 85
    :goto_2
    invoke-static {}, Lo/bpf;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "updateSetting key:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :cond_3
    return v8
.end method

.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 116
    const/4 v2, 0x0

    .line 117
    const/4 v3, 0x0

    .line 120
    :try_start_0
    invoke-direct {p0, p1}, Lo/awp;->a(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v3, v0

    .line 121
    if-eqz v3, :cond_0

    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 123
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 124
    const-string v0, "setting_value"

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 137
    :cond_0
    if-eqz v3, :cond_2

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 127
    :catch_0
    move-exception v4

    .line 129
    :try_start_1
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    const-string v1, "queryCursorSettingValue SQLException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 137
    if-eqz v3, :cond_2

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 131
    :catch_1
    move-exception v4

    .line 133
    :try_start_2
    sget-object v0, Lo/awp;->a:Ljava/lang/String;

    const-string v1, "queryCursorSettingValue IllegalStateException."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 137
    if-eqz v3, :cond_2

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 137
    :catchall_0
    move-exception v5

    if-eqz v3, :cond_1

    .line 139
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 141
    :cond_1
    throw v5

    .line 142
    :cond_2
    :goto_0
    return-object v2
.end method
