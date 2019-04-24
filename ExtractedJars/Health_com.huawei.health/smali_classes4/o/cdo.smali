.class public Lo/cdo;
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

    .line 63
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    .line 66
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_select_device_b1_name"

    const/16 v2, 0x15

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 67
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_select_device_b2_name"

    const/16 v2, 0x16

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 68
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_gemini"

    const/16 v2, 0x27

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 70
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_w1"

    const/16 v2, 0x24

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 71
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_w1"

    const/16 v2, 0x25

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 74
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_nys"

    const/16 v2, 0x2a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_eris"

    const/16 v2, 0x2f

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 76
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_messagecenter_color_band_name"

    const/16 v2, 0x33

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 77
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_messagecenter_color_band_name"

    const/16 v2, 0x17

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 79
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_device_r1_name_title"

    const/16 v2, 0x2b

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 81
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_leo"

    const/16 v2, 0x2e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 82
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_k2"

    const/16 v2, 0x3d

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 83
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_k2"

    const/16 v2, 0x3e

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 84
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_janus"

    const/16 v2, 0x4a

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 86
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_aw"

    const/16 v2, 0x51

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 87
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    const-string v1, "IDS_app_display_name_honor_aw"

    const/16 v2, 0x53

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 94
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(ILandroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez p1, :cond_0

    .line 20
    const-string v0, ""

    return-object v0

    .line 22
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 23
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 25
    :sswitch_0
    invoke-static {p1}, Lo/ene;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 28
    :sswitch_1
    invoke-static {p1}, Lo/ene;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 31
    :sswitch_2
    invoke-static {p1}, Lo/ene;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 34
    :sswitch_3
    const-string v0, "GRUS"

    return-object v0

    .line 37
    :sswitch_4
    invoke-static {p1}, Lo/ene;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 39
    :sswitch_5
    invoke-static {p1}, Lo/ene;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 41
    :sswitch_6
    invoke-static {p1}, Lo/ene;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 43
    :sswitch_7
    invoke-static {p1}, Lo/ene;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 45
    :sswitch_8
    invoke-static {p1}, Lo/ene;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 47
    :sswitch_9
    invoke-static {p1}, Lo/ene;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 49
    :sswitch_a
    invoke-static {p1}, Lo/ene;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 51
    :goto_0
    sget-object v0, Lo/cdo;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 52
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 53
    :cond_1
    const-string v0, "IDS_app_name_health"

    const-string v1, "string"

    invoke-virtual {v3, v0, v1, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    goto :goto_1

    .line 55
    :cond_2
    const-string v0, "string"

    invoke-virtual {v3, v4, v0, p2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    .line 58
    :goto_1
    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x23 -> :sswitch_0
        0x29 -> :sswitch_1
        0x2c -> :sswitch_2
        0x2d -> :sswitch_3
        0x4a -> :sswitch_4
        0x4d -> :sswitch_6
        0x4e -> :sswitch_5
        0x4f -> :sswitch_9
        0x50 -> :sswitch_a
        0x51 -> :sswitch_7
        0x53 -> :sswitch_8
    .end sparse-switch
.end method
