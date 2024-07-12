def solve_game(n, x, y):
  """
  حل بازی "گردو، شکستم" یک نفره

  Args:
      n: فاصله مهدی تا دیوار (سانتی‌متر)
      x: طول پای مهدی (سانتی‌متر)
      y: عرض پای مهدی (سانتی‌متر)

  Returns:
      (طولی, عرضی): تعداد دفعاتی که مهدی باید پایش را به صورت طولی و عرضی بگذارد.
      -1: اگر راه حلی برای رسیدن به دیوار وجود نداشته باشد.
  """

  max_longitudinal_steps = n // x
  max_transverse_steps = n // y

  if n % x != n % y:
    return -1

  longitudinal_steps = 0
  while (n - (longitudinal_steps * x)) % y != 0:
    longitudinal_steps += 1

  transverse_steps = n - (longitudinal_steps * x)

  return (longitudinal_steps, transverse_steps)

# مثال
n = 100
x = 20
y = 15

result = solve_game(n, x, y)

if result == -1:
  print("راه حلی برای رسیدن به دیوار وجود ندارد.")
else:
  longitudinal_steps, transverse_steps = result
  print(f"طولی: {longitudinal_steps}")
  print(f"عرضی: {transverse_steps}")
