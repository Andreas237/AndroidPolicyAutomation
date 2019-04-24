.class public Lo/cmf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 290
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    .line 293
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "B1\u624b\u73af"

    const/16 v2, 0x15

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 294
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "B2\u624b\u73af"

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 295
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "color band"

    const/16 v2, 0x17

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 296
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u7cd6\u62a4\u58eb\u8840\u7cd6\u4eea"

    const/16 v2, 0x1c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 297
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u5eb7\u5eb7\u8840\u538b"

    const/16 v2, 0x18

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 298
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u4e50\u5fc3\u8840\u538b"

    const/16 v2, 0x1d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 299
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u4e50\u5fc3\u4f53\u91cd\u8ba1"

    const/16 v2, 0x1f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 300
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "Mio"

    const/16 v2, 0x1a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 301
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u6728\u6728\u8840\u538b"

    const/16 v2, 0x19

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 302
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u6709\u54c1\u4f53\u91cd\u8ba1"

    const/16 v2, 0x1b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 303
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u624b\u673a\u8bb0\u6b65"

    const/16 v2, 0x1e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 304
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u624b\u52a8\u8f93\u5165"

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 305
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u6b27\u59c6\u9f99\u8840\u538b\u8ba1"

    const/16 v2, 0x21

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 306
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u5f3a\u751f\u8840\u7cd6\u4eea"

    const/16 v2, 0x22

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 307
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u624b\u673aGPS"

    const/16 v2, 0x20

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 308
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "B0\u624b\u73af"

    const/16 v2, 0x23

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 309
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "w1\u624b\u8868"

    const/16 v2, 0x24

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 310
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "W1_INTERNAL"

    const/16 v2, 0x25

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 311
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "N1"

    const/16 v2, 0x26

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 312
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "B3"

    const/16 v2, 0x27

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 313
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "JOHNSON1"

    const/16 v2, 0x28

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 314
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "METIS"

    const/16 v2, 0x29

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 315
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "NYX\u624b\u73af"

    const/16 v2, 0x2a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 316
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "R1\u8033\u673a"

    const/16 v2, 0x2b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 317
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "A1_PLUS"

    const/16 v2, 0x2c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 318
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "GRUS"

    const/16 v2, 0x2d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 319
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "LEO"

    const/16 v2, 0x2e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 320
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "ERIS"

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 321
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u534e\u4e3a\u4f53\u8102\u79f0"

    const/16 v2, 0x30

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 322
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "JOHNSON2"

    const/16 v2, 0x32

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 323
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "AW600"

    const/16 v2, 0x33

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 324
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "jabra\u8033\u673a"

    const/16 v2, 0x34

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 325
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "polar\u5fc3\u7387\u5e26"

    const/16 v2, 0x35

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 326
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u9c7c\u8dc3\u8bbe\u5907"

    const/16 v2, 0x36

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 327
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "S1pro"

    const/16 v2, 0x37

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 328
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u4e91\u5eb7\u5b9d\u667a\u80fd\u4f53\u8102\u79f0"

    const/16 v2, 0x38

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 329
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "k1\u624b\u73af"

    const/16 v2, 0x3d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 330
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "K2\u624b\u73af"

    const/16 v2, 0x3e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 331
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u534e\u4e3a\u667a\u80fd\u4f53\u8102\u79e4"

    const/16 v2, 0x39

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 332
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u5b9d\u83b1\u7279\u8840\u538b\u8ba1"

    const/16 v2, 0x46

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 333
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u6021\u6210\u8840\u7cd6\u4eea"

    const/16 v2, 0x47

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 334
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u9c7c\u8dc3\u8840\u7cd6\u4eea"

    const/16 v2, 0x48

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 335
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u9999\u5c71\u4f53\u8102\u79f0"

    const/16 v2, 0x49

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 336
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "JANUS"

    const/16 v2, 0x4a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 337
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u8363\u8000\u6709\u7ebf\u8033\u673a"

    const/16 v2, 0x4b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 338
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "NYX-B10"

    const/16 v2, 0x4c

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 339
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "CRIUS BLE\u624b\u73af"

    const/16 v2, 0x4d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 340
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "TERRA BLE\u624b\u73af"

    const/16 v2, 0x4e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 341
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "TALOS"

    const/16 v2, 0x4f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 342
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "FORTUNA"

    const/16 v2, 0x50

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 343
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "HUAWEI_AW70"

    const/16 v2, 0x51

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 344
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "HONOR_AW70"

    const/16 v2, 0x53

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 345
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    const-string v1, "\u534e\u4e3a\u667a\u80fd\u4f53\u8102\u79e4-\u4e91\u7248"

    const/16 v2, 0x52

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 346
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)Ljava/lang/String;
    .locals 2

    .line 353
    sget-object v0, Lo/cmf;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 354
    if-nez v1, :cond_0

    const-string v0, ""

    return-object v0

    .line 355
    :cond_0
    return-object v1
.end method
