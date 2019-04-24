.class public Lo/xc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 61
    const/16 v0, 0x19

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "_id"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "huid"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "gender"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "status"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "need_verify"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "userType"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "hobbies"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "image"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "inviteMessage"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "settings"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "age"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "tokenId"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "height"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "weight"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "stepLength"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "runLength"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "likeCount"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "isLiked"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "bg_wall"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    const-string v1, "imageURLDownload"

    const/16 v2, 0x13

    aput-object v1, v0, v2

    const-string v1, "bg_wall"

    const/16 v2, 0x14

    aput-object v1, v0, v2

    const-string v1, "notified_side"

    const/16 v2, 0x15

    aput-object v1, v0, v2

    const-string v1, "type"

    const/16 v2, 0x16

    aput-object v1, v0, v2

    const-string v1, "note"

    const/16 v2, 0x17

    aput-object v1, v0, v2

    const-string v1, "localfilepath"

    const/16 v2, 0x18

    aput-object v1, v0, v2

    sput-object v0, Lo/xc;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private d()Ljava/lang/String;
    .locals 2

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    const-string v0, "_id INTEGER PRIMARY KEY AUTOINCREMENT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    const-string v0, "huid BIGINT UNIQUE,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    const-string v0, "gender TINYINT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    const-string v0, "status NVARCHAR(45),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    const-string v0, "need_verify NVARCHAR(45),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    const-string v0, "userType TINYINT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    const-string v0, "hobbies BIGINT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    const-string v0, "image BLOB,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    const-string v0, "inviteMessage NVARCHAR(80),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    const-string v0, "settings INTEGER,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    const-string v0, "age INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    const-string v0, "tokenId NVARCHAR(45),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    const-string v0, "height INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    const-string v0, "weight INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    const-string v0, "stepLength INTEGER,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    const-string v0, "runLength INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    const-string v0, "likeCount INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    const-string v0, "isLiked INT,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    const-string v0, "bg_wall VARCHAR,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    const-string v0, "imageURLDownload VARCHAR(512),"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    const-string v0, "notified_side INTEGER"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    const-string v0, "notified_side INTEGER,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    const-string v0, "type INTEGER,"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    const-string v0, "note VARCHAR(255)"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/wr;Ljava/util/ArrayList;J)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;Ljava/util/ArrayList<Lo/xf;>;J)J"
        }
    .end annotation

    .line 131
    invoke-static {}, Lo/xe;->e()Lo/xe;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3, p4}, Lo/xe;->d(Lo/wr;Ljava/util/ArrayList;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public a(Lo/wr;)V
    .locals 3

    .line 73
    const-string v0, "socialuser"

    invoke-direct {p0}, Lo/xc;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lo/wr;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 75
    return-void
.end method

.method public c(Lo/wr;)I
    .locals 4

    .line 176
    const-string v0, "socialuser"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lo/wr;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I

    move-result v3

    .line 177
    return v3
.end method

.method public d(Lo/wr;Lo/xf;)J
    .locals 2

    .line 121
    invoke-static {}, Lo/xd;->d()Lo/xd;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/xd;->b(Lo/wr;Lo/xf;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lo/wr;)V
    .locals 5

    .line 288
    const-string v0, "socialuser"

    const/4 v1, 0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, v0, v1, v2}, Lo/wr;->deleteStorageData(Ljava/lang/String;ILjava/lang/String;)I
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    goto :goto_0

    .line 290
    :catch_0
    move-exception v4

    .line 291
    const-string v0, "SocialUserDB"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "resetDB Exception ERROR:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 293
    :goto_0
    return-void
.end method
